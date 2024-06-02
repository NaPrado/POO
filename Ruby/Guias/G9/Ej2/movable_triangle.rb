require_relative 'movable_figure'
require_relative 'triangle'
class MovableTriangle < Triangle
  include MovableFigure

  def points
    [@a,@b,@c]
  end
end