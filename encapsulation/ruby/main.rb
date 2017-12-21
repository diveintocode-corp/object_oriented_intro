require './bad_car'
require './car'
require './execute'

if __FILE__ == $0
  exe = Execute.new
  # 良い例
  puts "-- 良い例 -- "
  exe.excute_car
  # 悪い例
  puts "-- 悪い例 -- "
  exe.excute_bad_car
end
