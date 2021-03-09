from django.db import models

class File(models.Model):
    file1 = models.FileField(upload_to='img/file1/', blank=False, null=False)
    file2 = models.FileField(upload_to='img/file2/', blank=False, null=False)
    file3 = models.FileField(upload_to='img/file3/', blank=False, null=False)
    file4 = models.FileField(upload_to='img/file4/', blank=False, null=False)
    file5 = models.FileField(upload_to='img/file5/', blank=False, null=False)
    file6 = models.FileField(upload_to='img/file6/', blank=False, null=False)

    def __str__(self):
        return str(self.pk)