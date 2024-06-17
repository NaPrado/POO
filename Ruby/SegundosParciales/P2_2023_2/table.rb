class Table
  include Comparable
  def initialize(name,cap,sect)
    @name=name
    @cap=cap
    @sect=sect
  end

  def to_s
    "Table #{@name} for #{@cap} people in section #{@sect}"
  end
  def == (other)
    other.is_a?(Table) && [@name,@cap] == [other.name,other.cap]
  end
  def <=>(other)
    return nil unless other.is_a?(Table)
    [other.cap,@name] <=> [@cap,other.name]
  end
  alias_method :inspect, :to_s
  protected
  attr_reader :name, :cap
end
