require_relative 'movable_figure'
require_relative 'ellipse'
class MovableEllipse < Ellipse
  include MovableFigure

  def points
    [@inicio]
  end
end