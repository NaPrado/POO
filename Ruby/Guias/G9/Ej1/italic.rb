require_relative 'format'
class Italic < Format
  ELEMENT='i'
  def initialize(content)
    super(content,ELEMENT)
  end
end