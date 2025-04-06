# Kullanıcı ve Muhasabe Yönetim Programı

### Proje Amacı:
Not Defteri, KDV hesaplamalarının yapılabildiği, kullanıcı yönetiminin sağlandığı ve sistem ayarlarının yönetilebildiği bir JavaFX tabanlı masaüstü uygulama geliştirmek.

### Projede Yapılan İşlemler 
1- Giriş ve Rol Bazlı Yetkilendirme (Login/Register)
- Şifreler BCrypt ile şifrelenmiş olmalıdır.
- Roller: `ADMIN`, `OPERATOR`, `USER`

2- Kullanıcı Yönetimi (Sol Panel)
- Kullanıcıları listeleme, filtreleme (isim, eposta, rol)
- Ekle / Güncelle / Sil işlemleri
- Kullanıcıya rol atama
- Şifre resetleme, 
 `TableView` ile gösterim, `TextField` ve `ComboBox` ile filtreleme

3- KDV Hesaplama ve Yönetimi (Sağ Panel)
- Tutar ve KDV oranına göre anında hesaplama
- Her işlem için fiş no, tarih ve açıklama girilmesi
- KDV verilerini TXT, PDF, EXCEL'e aktarma
- Arama: Fiş no, tarih, açıklama üzerinden
- Yazdırma ve eposta gönderme özelliği

4- Tema ve Dil Desteği (Header
-  Karanlık / Açık tema değişimi
-  Türkçe – İngilizce dil desteği

5- Bildirim Sistemi 

6- Profil Yönetimi

7- Yedekleme & Geri Yükleme

8- Saat ve Tarih Gösterimi

9- Not Defteri Gösterimi

## Kullanılan Teknolojiler
- JAVA Core
- JAVA FX
- FXML
- SQL
- H2DB
- CSS
- BCrypt, Giriş Doğrulama
- Apache POI, PDFBox
- JavaMail API
- Timeline

## Kullanılan Program
-  Intellij Idea Community
