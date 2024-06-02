
class Bag
  def initialize
  @bag=Hash.new{0}
  end
  def add(other)
    @bag[other] += 1
  end

  def delete(other)
    @bag[other] -= 1 if @bag.key? other
    @bag.delete(other) if @bag[other].zero?
    @bag[other]
  end
  def size
    @bag.length
  end
  def count(other)
    @bag[other]
  end

  def to_s
    @bag.to_s
  end
end