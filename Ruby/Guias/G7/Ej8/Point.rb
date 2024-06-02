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
  def ==(other)
    other.is_a?(Point) && self.x == other.x && self.y == other.y
  end
  protected
  attr_reader :x, :y
end
