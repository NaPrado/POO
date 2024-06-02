# ejercicio A
class Gear
  def initialize(chainring,cog)
    @chainring=chainring
    @cog=cog
  end
  def ratio
    @chainring/@cog.to_f
  end
end


