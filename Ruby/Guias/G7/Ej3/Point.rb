class Point
  def initialize(x, y)
    @x = x
    @y = y
  end
  def distance(point)
    ((point.x - @x)**2 + (point.y - @y)**2)**0.5
  end
  def to_s
    "{#{@x}, #{@y}}"
  end
  protected
  attr_reader :x, :y
end
my_point = Point.new(1.5, 2.5)
puts my_point # Imprime {1.5, 2.5}
puts my_point.distance(Point.new(1.5, 3.0)) # Imprime 0.5