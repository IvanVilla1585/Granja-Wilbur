from django.db import models
from products.models import Product
from providers.models import Provider

class Invoice(models.Model):
	idInvoice = models.AutoField(primary_key=True)
	dateSale = models.DateField() 
	idProvider = models.ForeignKey(Provider)
	idProduct = models.ForeignKey(Product) 
	quantity = models.PositiveIntegerField()
	valuePurchase = models.DecimalField(decimal_places=3, max_digits=10)
	discount = models.DecimalField(decimal_places=3, max_digits=10)
	iva = models.DecimalField(decimal_places=3, max_digits=10)  
	total = models.DecimalField(decimal_places=3, max_digits=10)

	def __unicode__(self):
		return self.idProvider

