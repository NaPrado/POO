require_relative 'subway_station'
require_relative 'subway_line'
require 'set/sorted_set'
class SubwaySystem
  def initialize(name)
    @name = name
    @map = {}
  end
  def add_station(linea,station_name)
    ln=buildln(linea)
    st=buildst(station_name)
    @map[ln]=SortedSet.new unless @map.key? ln
    @map[ln] << SubwayStation.new(st)
    st
  end

  def lines
    @map.keys
  end
  def station(line)
    @map[buildln(line)]
  end

  private
  def buildln(linea)
    SubwayLine.new(linea)
  end
  def buildst(station_name)
    SubwayStation.new(station_name)
  end
end
