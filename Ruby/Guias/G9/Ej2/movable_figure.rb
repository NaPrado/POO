require_relative 'movable'
module MovableFigure
  include Movable
  def points
    raise "not implemented yet"
  end
  def move_up(delta)
    points.each { |point| point.move_up(delta) }
  end

  def move_down(delta)
    points.each { |point| point.move_down(delta) }
  end

  def move_left(delta)
    points.each { |point| point.move_left(delta) }
  end

  def move_right(delta)
    points.each { |point| point.move_right(delta) }
  end
end