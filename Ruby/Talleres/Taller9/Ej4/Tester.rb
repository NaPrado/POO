require_relative 'a'
require_relative 'b'
require_relative 'c'

a = A.new
p a.m_1 # 3
p a.m_2 # 3
p a.m_3 # 3

b = B.new
p b.m_1 # 4
#b.m_2 # undefined method `m_1' for 4:Integer (NoMethodError)
p b.m_3 # 4

c = C.new
p c.m_1 # 4
#c.m_2 # in `m_2': stack level too deep (SystemStackError)
p c.m_3 # 4