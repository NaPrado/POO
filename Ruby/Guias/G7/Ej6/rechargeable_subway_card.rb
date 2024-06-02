require_relative 'subway_card'
require_relative 'subway_central'
class RechargeableSubwayCard < SubwayCard
  def initialize(central)
    raise "Not a SubwayCard" unless central.is_a? SubwayCentral
    @central = central
    @amount=0
  end
  def recharge(amount)
    raise 'Invalid amount' unless amount.is_a?(Numeric) && amount.positive?
    @amount += amount
  end
  def ride_cost
    @central.ride_cost
  end
  def ride
    raise "Not enough funds" unless ride?
    @amount-=ride_cost
  end

  def ride?
    (@amount-ride_cost).positive?
  end
  def to_s
    "Rechargeable #{super} [Balance: $#{@amount}]"
  end
end