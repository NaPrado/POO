require_relative 'movable_figure'
require_relative 'rectangle'
class MovableRectangle < Rectangle
  include MovableFigure

  def points
    [@inicio,@fin]
  end
end