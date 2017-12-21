class Execute

  def excute_bad_car
    bad_car = BadCar.new
    puts "状態を取得"
    bad_car.get_status
    puts "勝手に操作"
    bad_car.speed_meter += 1
    bad_car.fuel_gauge -= 1
    bad_car.get_status
    puts "勝手に操作"
    bad_car.speed_meter -= 1
    bad_car.fuel_gauge += 1
    bad_car.get_status
  end

  def excute_car
    car = Car.new
    puts "状態を取得"
    car.get_status
    puts "走る"
    car.run
    car.get_status
    puts "止まる"
    car.stop
    car.get_status
  end

end
