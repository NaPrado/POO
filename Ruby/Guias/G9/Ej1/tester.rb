require_relative 'bold'
require_relative 'italic'
require_relative 'link'
text = PlainText.new 'Hola'
bold_text = Bold.new('Hola')
italic_text = Italic.new('Hola')
puts bold_text # <b>Hola</b>
puts italic_text # <i>Hola</i>
bold_italic_text = Bold.new(italic_text)
puts bold_italic_text # <b><i>Hola</i></b>
text.content = 'ITBA'
puts bold_text # <b>ITBA</b>
puts italic_text # <i>ITBA</i>
puts bold_italic_text # <b><i>ITBA</i></b>
link_text = Link.new(text,'www.itba.edu.ar')
link_bold_italic_text = Link.new(bold_italic_text,'www.itba.edu.ar')
bold_link_text = Bold.new(Link.new(text,'www.itba.edu.ar'))
puts link_text # <a href:"www.itba.edu.ar">ITBA</a>
puts link_bold_italic_text # <a href:"www.itba.edu.ar"><b><i>ITBA</i></b></a>
puts bold_link_text # <b><a href:"www.itba.edu.ar">ITBA</a></b>
text.content = 'Ejemplo'
puts link_bold_italic_text # <a href:"www.itba.edu.ar"><b><i>Ejemplo</i></b></a>
puts bold_link_text # <b><a href:"www.itba.edu.ar">Ejemplo</a></b>