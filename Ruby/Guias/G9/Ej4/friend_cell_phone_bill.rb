require_relative 'cell_phone_bill'
class FriendCellPhoneBill < CellPhoneBill
  DEFAULT_FRIEND_COST_PER_SECOND=0
  def initialize(my_number,limit)
    super my_number
    @limit = limit
    @numbers=[]
    @@friend_cost_per_second = DEFAULT_FRIEND_COST_PER_SECOND
  end
  def add_friend(number)
    raise "oiga uste eta aniadiendo a un numero ia aniadiho" if @numbers.include?number
    raise "nono papi te equivocaste" if @numbers.length == @limit
    @numbers.push(number)
  end
  def remove_friend(number)
    raise "caaaampeeeonn el numerito que me pasaste no esta en la lista de amigos, no flashees confianza" unless @numbers.include?(number)
    @numbers.delete(number)
  end
  def self.change_cost(cost)
    @@friend_cost_per_second = cost
  end

  def process_bill
    @calls.map { |c| @numbers.include?(c.to) ? @@friend_cost_per_second * c.cost : c.cost }.reduce(0, :+)
  end
end