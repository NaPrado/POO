# frozen_string_literal: true
require_relative 'subway_system'
require_relative 'subway_station_st'
class SubwaySystemSt < SubwaySystem
  private def buildst(station_name)
    SubwayStationSt.new(station_name)
  end
end
