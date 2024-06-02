require_relative 'ellipse'
class Circle < Ellipse
  def initialize(x, y)
    @x = x
    @y = y
    raise "Se ingreso algun dato invalido" if !x.is_a?(Point) && (!y.is_a?(Integer) || !y.is_a?(Float))
    super(x,y,y)
  end

  def to_s
    "Circle: [ Centro: #{@x} , Radio: #{@y} ]"
  end
  protected
  attr_accessor :x, :y
end