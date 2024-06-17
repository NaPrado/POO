require_relative 'subway_station.rb'
class SubwayStationSt < SubwayStation
  def initialize(name)
    super(name)
    @st=true
  end
  def close_station
    @st=false
  end
  def open_station
    @st=true
  end
  def to_s
    "#{super} is #{@st ? 'open' : 'closed' }"
  end
end
