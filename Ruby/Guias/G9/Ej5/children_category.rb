require_relative 'movie_category'
class ChildrenCategory < MovieCategory
  # Se cobra $3 por 3 días de alquiler, y cada día de atraso se cobra $1,5.
  PRICE = 3
  RENT_DAYS = 3
  LATE_PRICE = 1.5

  def initialize
    super(PRICE, RENT_DAYS, LATE_PRICE)
  end
end

