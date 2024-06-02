require_relative 'movable'
require_relative 'point'
class MovablePoint < Point
  include Movable

  def move_down(_delta)
    @y-=_delta
  end
  def move_up(_delta)
    @y+=_delta
  end
  def move_left(_delta)
    @x-=_delta
  end
  def move_right(_delta)
    @x+=_delta
  end
end