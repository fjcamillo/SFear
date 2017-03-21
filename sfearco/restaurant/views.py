from django.shortcuts import render
from django.http import HttpResponse
# Create your views here.

def index(request):
    return HttpResponse("<h1>Restaurants</h1>")

def site(request):
    return render(request, "restaurant/index.html")
