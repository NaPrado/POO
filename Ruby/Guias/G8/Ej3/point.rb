class Point
  def initialize(x, y)
    @x = x
    @y = y
  end
  def distance(point)
    ((point.x - @x)**2 + (point.y - @y)**2)**0.5
  end
  def distance_x(point)
    (self.x-point.x).abs
  end
  def distance_y(point)
    (self.y-point.y).abs
  end
  def to_s
    "{#{@x}, #{@y}}"
  end
  def ==(other)
    other.is_a?(Point) && self.x == other.x && self.y == other.y
  end

  def inspect
    to_s
  end

  def hash
    [@x,@y].hash
  end
  alias eql? ==
  protected
  attr_reader :x, :y
end
