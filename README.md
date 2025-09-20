# POST TEST 3 PRAKTIKUM PBO

## NAMA: MUHAMMAD ILYASA' 'IZZUDDIN

## NIM: 24091166033

### TEMA: DAFTAR GAME FAVORIT


### Deskripsi Singkat:
Tema ini tentang bagaimana memanajemen sebuah daftar game favorit, mulai dari create, read, update, delete sesuai keinginan kita. kita bisa menambahkan game favorit, menghapus game favorit yang ada di list, memperbarui game favorit, atau bahkan hanya mengecek game favorit yang ada dilist.

### Alur Program Secara singkat:

1. Program dimulai atau di_run_.

2. Setelah dimulai, program akan menampilkan menu utama.

3. User akan diminta untuk memilih menu:

    > 1. Tambah Game → user bisa menuliskan nama game, lalu game masuk ke
    daftar.
    
    > 2. Lihat Daftar Game → menampilkan seluruh daftar game favorit yang sudah disimpan.
    
    > 3. Memperbarui daftar game -> User bisa memperbarui game dari daftar game.

    > 4. Menghapus game dari daftar game -> User bisa menghapus daftar game jika sudah tidak relevan atau sudah tidak menjadi favorit.

### Penjelasan Kode

### Struktur Class Game

**1. Deklarasi Properties**

<img width="700" height="450" alt="{F31EF539-DC1E-409D-8663-BD8569DD8A3D}" src="https://github.com/user-attachments/assets/c0154e83-0b97-4516-b1fc-1d78deae546c" />

> 1. Diset private supaya tidak bisa diakses langsung dari luar class (encapsulation).

> 2. Ada 3 properti: nama, genre, dan tahunRilis.


**2. Constructor**

<img width="700" height="400" alt="{BE439D52-AC27-438F-99E8-2C924E458169}" src="https://github.com/user-attachments/assets/ceceed7a-7530-4db6-9667-ef5623df3f3b" />

> 1. Digunakan untuk membuat object baru dari class Game.


**3. Getter & Setter**

<img width="700" height="419" alt="{67CB6734-96DF-4D5E-B967-509819267C7C}" src="https://github.com/user-attachments/assets/43b35007-d174-49bf-9202-6624663ee6f9" />

> 1. Getter: mengambil nilai property.

> 2. Setter: mengubah nilai property.


**4. Method toString**

<img width="700" height="473" alt="{3F356456-0EF4-4FF0-A32E-FECAA7E9873A}" src="https://github.com/user-attachments/assets/10bfed8b-17b7-45f3-b2eb-329e42436127" />

> 1. Supaya object Game bisa ditampilkan langsung dengan format rapi.

===========================================================================

### Struktur Class GameService

**1. Deklarasi Property**

<img width="700" height="415" alt="{432B416B-FA20-489A-8E6A-576260EA7E7A}" src="https://github.com/user-attachments/assets/aa38be4c-6a7f-4347-a493-fbb1d328c9b2" />

> 1. daftarGame menyimpan list semua game favorit.

> 2. final artinya variabel daftarGame tidak bisa diganti dengan list baru, tapi isinya bisa ditambah/ubah/hapus.


**2. Method Create (Tambah Game)**

<img width="700" height="458" alt="{16E2C5F6-8D22-4E76-92FE-7A58C85E77EF}" src="https://github.com/user-attachments/assets/c038c031-194e-4858-823e-5a51bb25e58d" />

> 1. Menambahkan object Game baru ke dalam list daftarGame.


**3. Method Read (Tampilkan Game)**

<img width="700" height="425" alt="{5ED19A76-190D-425A-9F6E-57E33D9A1475}" src="https://github.com/user-attachments/assets/d25d4f2c-10ff-4b51-a09f-72306030b892" />

> 1. Menampilkan semua game yang ada di daftarGame.

> 2. Kalau kosong → ditampilkan pesan “Daftar kosong”.


**4. Method Update (Ubah Game)**

<img width="700" height="414" alt="{3D909450-6B51-45B1-A3DD-B2FFDF41A779}" src="https://github.com/user-attachments/assets/53ff9277-740d-470c-ae0d-ec330a14d887" />

> 1. Mengganti data game pada posisi tertentu dengan data baru (gameBaru).

> 2. Ada validasi supaya tidak error kalau nomor yang dipilih salah.


**5. Method Delete (Hapus Game)**

<img width="700" height="427" alt="{CCF81208-DFCD-4EAF-8CCA-0486F69AA271}" src="https://github.com/user-attachments/assets/bc702d4b-8ed6-463d-ad3f-c4a03d8d4d15" />

> 1. Menghapus game berdasarkan nomor yang dipilih.

> 2. Ada validasi agar tidak bisa menghapus index yang salah.

=========================================================================

### Struktur Class Main

**1. Deklarasi Scanner & Service**

<img width="700" height="446" alt="{D1D0FDD3-D6C7-4667-A681-259B99719AE8}" src="https://github.com/user-attachments/assets/7eed6895-48d2-464d-a9bb-e2dbbc1a605e" />

> 1. Scanner dipakai untuk input user.

> 2. GameService adalah objek yang mengatur logika CRUD.


**2. Menu Utama (do-while loop)**

<img width="700" height="450" alt="image" src="https://github.com/user-attachments/assets/b25a3ce2-5474-4473-bd58-7b0ae8f8a959" />
<img width="700" height="404" alt="image" src="https://github.com/user-attachments/assets/3fe093fb-d383-44d9-92d0-f9eb97472658" />

> 1. Menggunakan do-while supaya menu terus berulang sampai user memilih keluar (opsi 5).

> 2. Setiap input user disimpan dalam variabel pilihan.


**3. Switch Case 1 → Tambah Game**

<img width="700" height="456" alt="{88AD99D8-D9FC-491A-A0F9-81BE66CAB0A4}" src="https://github.com/user-attachments/assets/5663cd9d-9210-41c3-bd6d-03b86ddea1b7" />

> 1. Input data baru (nama, genre, tahun).

> 2. Membuat object Game baru dengan constructor.

>3. Menyimpan lewat service.tambah().


**4. Case 2 → Lihat Daftar Game**
   
<img width="700" height="419" alt="{D9D47D35-36D8-45B1-95C4-078F15D0EEE6}" src="https://github.com/user-attachments/assets/3d85b1b7-7386-422e-8e07-afc968f04256" />

> 1. Menampilkan semua game yang sudah tersimpan.

> 2. Dipanggil lewat method tampilkan() di GameService.


**5. Case 3 → Ubah Game**

<img width="700" height="418" alt="{DE3F24DB-18B5-4416-8877-6598FDDB1D0A}" src="https://github.com/user-attachments/assets/bc063774-c89e-4b0b-8836-9bf836df9220" />

> 1. Menampilkan daftar game → user pilih nomor game.

> 2. Input data baru → buat object Game baru.

> 3. Mengganti data lama dengan service.ubah().


**6. **Case 4 → Hapus Game****

<img width="700" height="457" alt="{53ED5883-DCD3-4635-B7DE-8279403464F0}" src="https://github.com/user-attachments/assets/70d4beda-f163-4eed-9039-1bc983a0c3af" />

> 1. Menampilkan daftar game.

> 2. User pilih nomor game yang mau dihapus.

> 3. Menghapus lewat service.hapus().

**7. Case 5 → Keluar**

<img width="700" height="422" alt="{E1405A56-C4DC-402D-8F70-375312DA8BFB}" src="https://github.com/user-attachments/assets/bdc2ddd0-3dfe-4ea5-8974-3f72c8e69135" />

> 1. Menutup program.

=====================================================================================================

### Struktur PCGame.java

**1. Package**

<img width="700" height="418" alt="image" src="https://github.com/user-attachments/assets/be3e112f-a5b5-4e77-b0d4-0bfc36df8541" />

> 1. Menyatakan bahwa class PCGame berada di dalam package Model.

> 2. Package digunakan untuk mengelompokkan class agar lebih rapi dan memudahkan pengelolaan (di sini khusus untuk class model/data).


**2. Deklarasi Kelas**

<img width="700" height="418" alt="{4310C27B-99B1-45B8-9223-F81868726776}" src="https://github.com/user-attachments/assets/5d07b0af-732d-4e5b-8289-3ecb08cc238d" />

> 1. public class → Class dapat diakses dari mana saja.

> 2. extends Game → PCGame adalah subclass dari Game (pewarisan/inheritance).


**3. Constructor**

<img width="700" height="444" alt="{53DEF2B0-08E5-48EB-A0F2-7D27EEC86409}" src="https://github.com/user-attachments/assets/8d7adfa8-8a20-46cc-bf52-69419ae982cb" />

> 1. public → Dapat dipanggil dari luar class saat membuat objek.

> 2. Parameter → Data awal (nama, genre, tahunRilis) untuk membuat objek game PC.

> 3. super(...) → Memanggil constructor milik Game agar atribut dasar diinisialisasi.


**4. Method Override**

<img width="700" height="486" alt="{AC0C217C-5020-4F78-99B2-977593CBF95F}" src="https://github.com/user-attachments/assets/e15258d2-1fd3-4a00-babc-7398b65a98fa" />

> 1. @Override → Menandakan method toString() menimpa (override) method bawaan Game.

> 2. super.toString() → Memanggil output toString() dari Game, lalu menambahkan label “| (PC)”.

==========================================================================

### Struktur MobileGame.java

**1. Package**

<img width="700" height="418" alt="{034107DD-7E49-442D-B43E-88CFA35F2E00}" src="https://github.com/user-attachments/assets/b1428565-6e05-4db9-963d-3fc7d6eeb141" />

> 1. Sama seperti PCGame, class ini juga berada di package Model.


**2. Deklarasi Class**

<img width="700" height="419" alt="{D1D52BD8-274A-4BCE-8428-D8533E4C2763}" src="https://github.com/user-attachments/assets/c987c5e8-6ee6-44e7-aa8d-d887bf0cbe78" />

> 1. public → Class dapat diakses dari luar.

> 2. extends Game → MobileGame juga merupakan subclass dari Game.


**3. Constructor**

<img width="700" height="442" alt="{694E6A5E-1DDA-49BF-B690-5EDCDC133006}" src="https://github.com/user-attachments/assets/f4889066-7aa4-4120-9790-c2b8d1a864f0" />

> 1. Memiliki struktur dan tujuan yang sama seperti constructor PCGame.

> 2. Memanggil constructor Game agar atribut dasar (nama, genre, tahunRilis) langsung diwarisi.


**4. Method Override**

<img width="700" height="469" alt="{522841D8-4546-41CC-9D2E-5AF7EC046B19}" src="https://github.com/user-attachments/assets/7883ed75-2042-4875-9d48-314b943303b1" />

> 1. Meng-override toString() dari Game.

> 2. Menambahkan label “| (Mobile)” pada output string agar platform game jelas.

===========================================================================

### Output

**1. Menampilkan pilihan dari program** 

<img width="700" height="400" alt="{43CE24B8-A644-4A48-B684-98C1E7EF923D}" src="https://github.com/user-attachments/assets/62cda6f5-04f5-4ea0-a2ff-2fa8a562cfe9" />

Saat memulai program, user akan diminta 5 opsi yang ingin dilakukan yaitu Menambah game, Melihat daftar game, Mengubah atau memperbarui game di daftar game yang sudah ada sebelumnya, Menghapus game yang ada di daftar game, dan keluar.


**2. Memilih opsi Jenis Game**

<img width="700" height="456" alt="{B381D62E-ABFB-406E-83D5-F1F23D18D6D5}" src="https://github.com/user-attachments/assets/a533c7cb-a656-4d2e-af45-ce4a8cb5ef6a" />

Setelah memilih opsi tambah game, user harus memilih jenis game. jenis game ini digunakan untuk mengelompokkan game-game berdasarkan devicenya.


**3. Memilih opsi Tambah game**

<img width="7oo" height="450" alt="{9AD0B300-093A-4DBB-8C16-902A5AD589F9}" src="https://github.com/user-attachments/assets/78695850-2cc9-4c8f-b77f-3fe6404342cc" />

Jika user memilih nomor 1 yaitu tambah game, maka program akan meminta user untuk memilih jenis game terlebih dahulu kemudian. memasukkan nama game, genre game, dan tahun rilis game.


**4. Memilih opsi Lihat Daftar Game**

<img width="700" height="487" alt="{21E90A0B-BAA0-48FD-A553-8B604CC00BA1}" src="https://github.com/user-attachments/assets/0feb3824-2aba-420c-8219-a99497e3e97f" />

Jika user memilih nomor 2 yaitu melihat daftar game, maka program akan menampilkan daftar game yang telah dimasukkan sebelumnya.


**4. Memilih opsi Ubah Game**

<img width="700" height="461" alt="{77FADBB8-35CB-4C68-B4C3-04170B676524}" src="https://github.com/user-attachments/assets/f1b2c1d4-9cb3-47fa-8b52-c38a847a0f6b" />

Jika user memilih nomor 3 yaitu mengubah game di daftar game, maka program akan meminta user untuk memilih nomor urut dari game yang ingin diubah kemudian user diminta untuk memilih jenis game terlebih dahulu, kemudian memasukkan nama game, genre game, dan tahun rilis game.


**5. Memilih Hapus Game**

<img width="700" height="462" alt="{73041A91-43AD-4097-B4F0-DD62E48BF8D8}" src="https://github.com/user-attachments/assets/4f2cc4da-a239-4050-8b6e-5a37f0ae392e" />

Jika user memilih nomor 4 yaitu menghapus game, maka program akan meminta user untuk memilih nomor urut dari game yang ingin dihapus.


**6. Memilih Keluar**

<img width="700" height="412" alt="{4F096320-5951-40B9-B32E-F01BDB00951D}" src="https://github.com/user-attachments/assets/94fa4320-a311-49c2-bb88-35238960e677" />

Jika user memilih nomor 5 yaitu keluar, maka program akan langsung menyelesaikan program.

============================================================================================================================================================
