require_relative 'subway_central'
require_relative 'subway_card'
class FixedSubwayCard < SubwayCard
  def initialize(central,rides)
    raise "Not a central" unless central.is_a? SubwayCentral
    raise "Not a Integer" unless rides.is_a? Integer
    @central = central
    @rides = rides
  end

  def ride?
    @rides.positive?
  end
  def ride
    raise "No rides available" if @rides.zero?
    @rides-=1
  end
  def to_s
    "Fixed #{super} [Rides: #{@rides}]"
  end
end