
class MovieCategory
  def initialize(price, rent_days, late_price)
    @price = price
    @rent_days = rent_days
    @late_price = late_price
  end

  def charges(days)
    return @price + (@late_price * (days - @rent_days)) if days > @rent_days
    @price
  end

  # Cada película alquilada suma un punto.
  def points(_days)
    1
  end
end