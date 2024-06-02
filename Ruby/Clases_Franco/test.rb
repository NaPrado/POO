n=[1,nil,2,nil,3,nil,4,nil]
m=n.map { |e| e.nil? ? 0 : e }
p m
j=n.reduce { |sum,e | e.nil? ? sum : sum+e }
p j
p m.reverse_each
