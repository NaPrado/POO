require_relative 'figure'
class Triangle < Figure
  def initialize(a, b, c)
    raise "Se debe ingresar objetos tipo point" if !a.is_a?(Point) && !b.is_a?(Point) && !c.is_a?(Point)
    @a = a
    @b = b
    @c = c
  end

  def perimeter
    @a.distance(@b)+@b.distance(@c)+@c.distance(@a)
  end

  def area
    (self.semiperimeter*((self.semiperimeter-@a.distance(@b))*(self.semiperimeter-@b.distance(@c))*(self.semiperimeter-@c.distance(@a))))**0.5
  end
  def to_s
    "Triangle: [ #{@a} , #{@b} , #{@c} ]"
  end
  def == other
    other.is_a? Triangle && @a == other.a && @b == other.b && @c == other.c
  end
  private
  def semiperimeter
    (self.perimeter)/2
  end
  attr_accessor :a, :b, :c
end