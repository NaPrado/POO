require_relative 'stack'
class AccessStack < Stack
  def initialize
    @pop_accesses=0
    @push_accesses=0
    super
  end

  def pop
    @pop_accesses += 1
    super
  end
  def push(o)
    @push_accesses += 1
    super o
  end
  attr_reader :push_accesses, :pop_accesses
end