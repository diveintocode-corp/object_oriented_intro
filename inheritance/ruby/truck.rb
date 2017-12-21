class Truck < Car

  def initialize
		super
    @carrier = 0
  end

  def get_status
    super
    puts("carrier:" + @carrier.to_s)
  end

  def unload
    @carrier -= 1
  end

  def load
    @carrier += 1
	end

end
