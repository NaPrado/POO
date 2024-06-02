require_relative 'movable_figure'
require_relative 'circle'
class MovableCircle < Circle
  include MovableFigure
  def points
    [@x]
  end
end