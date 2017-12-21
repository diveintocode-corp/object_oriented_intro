require './car'
require './super_car'
require './truck'
require './soccer_man'
require './soccer_man_gon'
require './soccer_man_nakata'
require './execute'
require './soccer_man_execute'

if __FILE__ == $0
  exe = Execute.new

  # スーパーカー
  puts "-- スーパーカー -- "
  exe.excute_super_car

  # トラック
  puts "-- トラック -- "
  exe.excute_truck

  # サッカーチーム
  soccer_exe = SoccerManExecute.new

  # サッカー選手なかた
  puts "-- サッカー選手なかた -- "
  soccer_exe.excute_nakata

  # サッカー選手ごん
  puts "-- サッカー選手ごん -- "
  soccer_exe.excute_gon
end
