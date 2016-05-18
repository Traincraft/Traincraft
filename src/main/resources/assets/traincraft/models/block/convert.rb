#!/usr/bin/env ruby
data = File.open(ARGV.first)

odata = ""

def check_part(input)
    input = input.to_f
    if input < 0
        0.00000000000001
    elsif input > 1
        0.99999999999999
    else
        input
    end
end

while line = data.gets
    line.chomp!
    if line.start_with? 'vt '
        parts = line.split ' '
        parts[1] = check_part parts[1]
        parts[2] = check_part parts[2]
        line = parts.join ' '
    end
    odata << line + "\n"
end

File.write(ARGV.first, odata)