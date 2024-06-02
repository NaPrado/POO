require 'set/sorted_set'
require_relative 'point'
require_relative 'rectangle'
require_relative 'triangle'
require_relative 'ellipse'
require_relative 'circle'

my_sorted_figure_set = SortedSet.new
my_sorted_figure_set.add(Rectangle.new(Point.new(10, 20), Point.new(20, 10)))
my_sorted_figure_set.add(Circle.new(Point.new(10, 20), 1))
my_sorted_figure_set.add(Circle.new(Point.new(10, 20), 3))
puts my_sorted_figure_set

