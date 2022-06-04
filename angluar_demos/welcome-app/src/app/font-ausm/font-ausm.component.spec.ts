import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FontAusmComponent } from './font-ausm.component';

describe('FontAusmComponent', () => {
  let component: FontAusmComponent;
  let fixture: ComponentFixture<FontAusmComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FontAusmComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FontAusmComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
