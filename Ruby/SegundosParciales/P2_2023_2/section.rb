class Section
  def initialize (name)
	  @name=name
  end
  def hash
    @name.hash
  end
  def == (other)
    return false unless other.is_a? Section
    @name == other.name
  end
  alias :eql? :==
  def to_s
    @name.to_s
  end
  protected
  attr_reader :name
end
