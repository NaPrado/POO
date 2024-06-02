require_relative 'plain_text'
class Format < PlainText
  def initialize(content,format)
    @format = format
    super(content)
  end

  def source
    "<#{@format}>#{super}</#{@format}>"
  end
end