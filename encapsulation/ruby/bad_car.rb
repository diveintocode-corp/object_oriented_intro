class BadCar
  attr_accessor :fuel_gauge, :speed_meter

  def initialize
    @fuel_gauge = 100
    @speed_meter = 0
  end

  def get_status
    puts("fuel_gauge:" + @fuel_gauge.to_s)
    puts("speed_meter:" + @speed_meter.to_s)
  end

  def run
    @fuel_gauge -= 1
    @speed_meter += 1
  end

  def stop
    @speed_meter = 0
  end

  def refuel
    if @speed_meter == 0
      @fuel_gauge = 100
    else
      puts "Boo!!"
    end
  end

end
