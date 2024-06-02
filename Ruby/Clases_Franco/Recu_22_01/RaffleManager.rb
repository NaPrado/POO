
class RaffleManager
  def initialize
    @participants_by_raffle=Hash.new{[]}
  end
  def enter_raffle(raffle, participant)
    raise ArgumentError, "Participant #{participant.name}" if @participants_by_raffle[raffle].include?(participant)
    @participants_by_raffle[raffle]=@participants_by_raffle[raffle]<<participant
  end
  def exit_raffle(raffle, participant)
    raise ArgumentError, "Participant #{participant.name}"  unless @participants_by_raffle.key(raffle)
    @participants_by_raffle[raffle].delete(participant)
  end
  def raffles
    return 'Raffle Manager is empty' if @participants_by_raffle.keys.empty?
    s = "Raffle Manager\n"
    @participants_by_raffle.keys.sort.each do |raffle|
      s += "#{raffle}:\n"
      @participants_by_raffle[raffle].each do |participant|
        s += "+ #{participant}\n"
      end
    end
    s
  end
end
class Raffle
  def initialize(event,price)
    @event=event
    @price=price
  end

  def to_s
    "#{@event} $#{@price}"
  end
  def hash
    [@event,@price].hash
  end
  def <=>(other)
    return  nil unless other.is_a?(self.class)
    [self.price, self.event]<=>[other.price,other.event]
  end
  alias_method :eql?, :==
  attr_reader :event, :price
end
class Participant
  def initialize(name,dni)
    @name=name
    @dni=dni
  end

  def to_s
    name.to_s
  end

  def ==(other)
    dni == other.dni
  end
  attr_reader :name
  attr_reader :dni
end

rm = RaffleManager.new

viaje_egresados = Raffle.new('Viaje Egresados', 60000)
festival = Raffle.new('Festival', 90000)
feria = Raffle.new('Feria', 60000)

pedro = Participant.new('Pedro', 1234)
jorge = Participant.new('Jorge', 4321)
ana = Participant.new('Ana', 8888)
juan = Participant.new('Juan', 9999)
arturo = Participant.new('Arturo', 5555)

puts rm.raffles
# Raffle Manager is empty

# La participante Ana entra en el sorteo Viaje Egresados
rm.enter_raffle(viaje_egresados, ana)
rm.enter_raffle(viaje_egresados, juan)
rm.enter_raffle(viaje_egresados, arturo)
rm.enter_raffle(festival, pedro)
rm.enter_raffle(festival, jorge)
rm.enter_raffle(feria, pedro)
puts rm.raffles
# Raffle Manager
# Festival - Prize $90000:
# + Pedro - DNI: 1234
# + Jorge - DNI: 4321
# Feria - Prize $60000:
# + Pedro - DNI: 1234
# Viaje Egresados - Prize $60000:
# + Ana - DNI: 8888
# + Juan - DNI: 9999
# + Arturo - DNI: 5555
# La participante Ana se retira del sorteo Viaje Egresados
rm.exit_raffle(Raffle.new('Viaje Egresados', 60000), Participant.new('Ana', 8888))
puts rm.raffles
# Raffle Manager
# Festival - Prize $90000:
# + Pedro - DNI: 1234
# + Jorge - DNI: 4321
# Feria - Prize $60000:
# + Pedro - DNI: 1234
# Viaje Egresados - Prize $60000:
# + Juan - DNI: 9999
# + Arturo - DNI: 5555
begin
  # Falla pues nadie entró al torneo F5
  rm.exit_raffle(Raffle.new('Torneo F5', 60000), Participant.new('Paula', 6666))
rescue ArgumentError => e
  puts e
  # Raffle Torneo F5 not exists
end
begin
  # Falla pues Juan ya entró en el sorteo Viaje Egresados
  rm.enter_raffle(viaje_egresados, Participant.new('Juan', 9999))
rescue ArgumentError => e
  puts e
  # Participant Juan already entered
end