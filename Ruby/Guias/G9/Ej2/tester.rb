require_relative 'movable_point'
require_relative 'movable_ellipse'


movable_circle = MovableEllipse.new(MovablePoint.new(10, 20), 1, 2)
movable_circle.move_right(1)
puts movable_circle


