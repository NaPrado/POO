class Accounts
  def initialize
    raise NotImplementedError.new("#{self.class.name} is an abstract class.")
  end
  def deposit(amount)
    @balance +=amount
  end
  def withdraw(amount)
    @balance -=amount
  end
  def get_balance
    @balance
  end
  def to_s
    "Cuenta #{@id} con saldo #{@balance}"
  end
  protected
  def withdraw?(amount)
    raise NotImplementedError.new("#{self.class.name} is an abstract class.")
  end
end