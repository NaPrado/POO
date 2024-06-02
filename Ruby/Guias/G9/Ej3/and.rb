require_relative 'expression'
class And
  include Expression
  def initialize(x, y)
    @x = x
    @y = y
  end

  def evaluate
    @x.evaluate && @y.evaluate
  end
end