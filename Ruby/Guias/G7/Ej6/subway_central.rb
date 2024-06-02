class SubwayCentral
  def initialize(ride_cost)
    raise "Invalid Ride Cost" unless ride_cost.is_a?(Numeric) && ride_cost.positive?
    @ride_cost=ride_cost
  end

  def to_s
    "Subway Central [$#{@ride_cost}]"
  end

  attr_accessor :ride_cost
end