require_relative 'gear'
require_relative 'wheel'
class Gear
  def initialize(chainring,cog,rim=nil,tire=nil)
    @chainring = chainring
    @cog = cog
    @wheel = Wheel.new(rim,tire)
  end
  def gear_inches
    self.ratio*@wheel.diametre
  end
end

puts Gear.new(52, 11, 26, 1.5).gear_inches # => 137.0909090909091

puts Gear.new(52, 11).ratio # => 4.7272727272727275