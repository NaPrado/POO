require_relative 'movie_category'
class StandardCategory < MovieCategory
  # Se cobra $2 por 2 días de alquiler, y cada día de atraso se cobra $1,5
  PRICE = 2
  RENT_DAYS = 2
  LATE_PRICE = 1.5

  def initialize
    super(PRICE, RENT_DAYS, LATE_PRICE)
  end
end
