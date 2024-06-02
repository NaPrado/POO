require_relative 'Accounts'
class SavingsAccount < Accounts
  def initialize(id)
    @id = id
    @balance=0
  end

  def withdraw(amount)
    raise 'No cuenta con los fondos necesarios' unless self.withdraw?(amount)
    super(amount)
  end
  protected def withdraw?(amount)
    @balance - amount >= 0
  end
end