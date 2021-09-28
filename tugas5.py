ipk = str(input("Masukkan IPK Anda = "))
studi = str(input("Berapa Taun Anda Studi Di Sini = "))

if(float(ipk) >= 3.51 and float(ipk) <= 4 and float(studi) <= 4):
    print("Selamat Anda lulus Summa Cumlaude dengan ipk " + ipk + " dengan studi selama " + studi + " Tahun")

elif(float(ipk) >= 3.51 and float(ipk) <= 4 and float(studi) > 4):
    print("Selamat Anda Lulus Cumlaude Dengan IPK = " + ipk)

elif(float(ipk) >= 3.01 and float(ipk) < 3.51):
    print("Selamat Anda Lulus Sangat Memuaskan Dengan IPK = " + ipk)

elif(float(ipk) >= 2.76 and float(ipk) < 3.01):
    print("Selamat Anda Lulus Memuaskan Dengan IPK = " + ipk)

elif(float(ipk) >= 2.00 and float(ipk) < 2.76):
    print("Selamat Anda lulus Cukup Memuaskan Dengan IPK = " + ipk)

elif(float(ipk) < 2.00):
    print("Mohon Maaf Anda Tidak Lulus Dengan IPK = " + ipk + " Tetap Semangat Dan Jangan Menyerah !!!")

elif(float(ipk) > 4 or float(ipk) < 0):
    print("Nilai IPK Anda Tidak Valid")