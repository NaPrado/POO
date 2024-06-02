require_relative 'movie_category'
class RecentCategory < MovieCategory
  PRICE = 3
  RENT_DAYS = 1
  LATE_PRICE = 3

  def initialize
    super(PRICE, RENT_DAYS, LATE_PRICE)
  end

  # Se cobra $3 por cada día de alquiler.
  def charges(days)
    @rent_days * days
  end

  # Suma un punto extra por cada día extra alquilada.
  def points(days)
    super + days - @rent_days
  end
end

