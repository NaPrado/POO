require_relative 'plain_text'
class Link < PlainText
  def initialize(content,link)
    @link=link
    super(content)
  end

  def source
    "<a href=\"#{@link}\">#{super}</a>"
  end
end