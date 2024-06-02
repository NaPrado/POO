class Customer
  attr_reader :points, :charges

  def initialize(name)
    @name = name
    @points = 0
    @charges = 0
  end

  def add_charges(charges)
    @charges += charges
  end

  def add_points(points)
    @points += points
  end
end

