require_relative 'rechargeable_subway_card'
class DiscountRechargeableSubwayCard < RechargeableSubwayCard
  def initialize(central,discount)
    raise "Not a central" unless central.is_a?(SubwayCentral)
    raise "Not a numeric discount" unless discount.is_a?(Numeric) && discount >= 0 && discount <= 1
    super(central)
    @discount = discount
  end

  def ride_cost
    super * (1-@discount)
  end
end